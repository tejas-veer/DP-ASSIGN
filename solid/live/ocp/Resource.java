package solid.live.ocp;

interface  Resource {
    int findFreeSlot();
    void markFreeSlot(int resourceId);
    void markSlotBusy(int resourceId);
}
