package org.launchcode.studio7;

public abstract class ComputerDisk extends BaseDisc {

    private boolean isInserted;

    public ComputerDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.isInserted = false;
    }

    public ComputerDisk(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
    }


    public boolean isInserted() { return this.isInserted; }

    // Floppy disks, LPs, CDs
    public void insert() {
        this.isInserted = true;
    }
}
