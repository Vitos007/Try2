package HomeworkLecture6.inner;


import java.io.IOException;

public class Tank {
    private Gun gun;
    private int shellsQuantity;

    public Tank(int shellsQuantity) {
        this.gun = new Gun();
        this.shellsQuantity = shellsQuantity;
    }

    public void fire() throws IOException {
        gun.fire();
    }

    public void load() throws IOException{
        if (!gun.isLoaded()) {
            gun.load();
        } else {
            throw new IOException("Gun is already loaded");
        }
    }


    public void reload(int shells) {
        shellsQuantity += shells;
    }

    public class Gun {
        private boolean loaded;

        public Gun() {
            this.loaded = false;
        }

        public boolean isLoaded() {
            return loaded;
        }

        public void setLoaded(boolean loaded) throws IOException{
            if (shellsQuantity > 0) {
                this.loaded = loaded;
                shellsQuantity--;
            } else {
                throw new IOException("Out of ammo! Go to the base!!!");
            }
        }

        public void load() throws IOException{
            if (!isLoaded()) {
                setLoaded(true);
            } else {
                throw new IOException("Already loaded, can't load!");
            }
        }

        public void fire() throws IOException {
            if (isLoaded()) {
                System.out.println("Fire!!!!");
                setLoaded(false);
            } else {
                throw new IOException("Have no shell in gun, please load!!");
            }
        }
    }

}
