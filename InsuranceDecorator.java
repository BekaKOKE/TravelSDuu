package Proj3;

public abstract class InsuranceDecorator implements Decorator {
    private String coverageType;

    public InsuranceDecorator(String coverageType) {
        this.coverageType = coverageType;
    }

    @Override
    public String addService() {
        System.out.println("Added Insurance: " + coverageType);
        return null;
    }
}
