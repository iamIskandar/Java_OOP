class Student {
	private String name;
	private String MatricsNo;
	private double gpa;
    private static int totalCredit;

    Student() {
    	totalCredit=0;
    }

    public void setName(String n) {
    	name=n;
    }

    public void setMatricsNo(String m) {
    	MatricsNo=m;
    }

	public void setGpa(double g) {
	   gpa=g;
	}

    public double getGpa() {
    	return gpa;
    }

	public void setTotalCredit(int c) {
		totalCredit=c;
	}

    public int getTotalCredit() {
    	return totalCredit;
    }

    public String getName() {
    	return name;
    }

    public String getMatricsNo() {
    	return MatricsNo;
    }
}
