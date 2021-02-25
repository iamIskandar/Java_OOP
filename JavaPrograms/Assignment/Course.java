enum Course {
		SCSJ2154 ("Object Oriented Programming",4),
		SCSD2623 ("Database Programming",3),
		SCSV1223 ("Web Programming",3),
		SCSJ2203 ("Software Engineering",3),
		SCSR2043 ("Operating System",3),
		ULAB2122 ("Advanced Academic English Skills",2),
		UCSD2762 ("Fundamentals of Technopreneurship",2),
		SCSD3761 ("Technopreneurship Seminar",1),

		A(4.0),
		B(3.0),
		C(2.0),
		D(1.0),
		E(0.0);

		private String desc;
		private int credit;
		private double gp;

		Course(String desc, int credit) {
			this.credit=credit;
			this.desc=desc;
		}

		Course(double gp) {
			this.gp=gp;
		}

		public String getDescription() {
		    return desc;
		}

		public int getCredit() {
			return credit;
		}

		public double getGradeValue() {
		    return gp;
     	}
}
