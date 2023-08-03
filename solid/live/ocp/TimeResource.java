package solid.live.ocp;

public class TimeResource implements Resource {

    @Override
    public int findFreeSlot() {
        return 0;
    }


    @Override
    public void markFreeSlot(int resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'markFreeSlot'");
    }

    @Override
    public void markSlotBusy(int resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'markSlotBusy'");
    }
    
}
