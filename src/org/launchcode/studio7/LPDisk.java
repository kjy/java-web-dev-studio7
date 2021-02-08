package org.launchcode.studio7;

public class LPDisk extends BaseDisc implements OpticalDisk {
    public LPDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
    // Vinyl Disc
}
