public class FakeEligibilityStore {

    private volatile static FakeEligibilityStore instance= null ;

    private FakeEligibilityStore() {}

    public static FakeEligibilityStore getInstance()
    {
        if(instance== null ) {
            synchronized (FakeEligibilityStore.class ) {
                if (instance == null) {
                    instance = new FakeEligibilityStore();
                }
            }
        }
        return instance ;
    }

    public void save(String roll ) {
        System.out.println("Saved evaluation for roll=" + roll);
    }
}
