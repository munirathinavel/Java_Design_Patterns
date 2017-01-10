package com.pattern.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		buildOrganizationStructure().print();
	}

	private static Organization buildOrganizationStructure() {
		final Organization organization = new Organization("ABC0123456789", "Tricon Infotech Pvt. Ltd.");
		organization.setAddress("Koramangala, Bangalore - 560034");

		CEO ceo = new CEO(1l, "CEO");
		organization.getEmployees().add(ceo);

		BusinessHead businessHead = new BusinessHead(21l, "BusinessHead1");
		ceo.addSubordinate(businessHead);

		Director director = new Director(22l, "Director1");
		ceo.addSubordinate(director);

		//
		HRManager hrManager = new HRManager(311l, "HRManager1");
		director.addSubordinate(hrManager);

		HRAssociate hrAssociate = new HRAssociate(41l, "HRAssociate1");
		hrManager.addSubordinate(hrAssociate);

		hrAssociate = new HRAssociate(42l, "HRAssociate2");
		hrManager.addSubordinate(hrAssociate);

		//
		ProjectManager technicalManager1 = new ProjectManager(321l, "ProjectManager1");
		director.addSubordinate(technicalManager1);
		TechnicalArchitect technicalArchitect1 = new TechnicalArchitect(421l, "TechnicalArchitect1");
		technicalManager1.addSubordinate(technicalArchitect1);

		TechnicalLead technicalLead1 = new TechnicalLead(521l, "TechnicalLead1");
		technicalLead1.addSubordinate(new Developer(6211l, "Developer1"));
		technicalLead1.addSubordinate(new Developer(6212l, "Developer2"));
		technicalLead1.addSubordinate(new Developer(6213l, "Developer3"));
		technicalArchitect1.addSubordinate(technicalLead1);

		ProjectManager technicalManager2 = new ProjectManager(322l, "ProjectManager2");
		director.addSubordinate(technicalManager2);
		TechnicalArchitect technicalArchitect2 = new TechnicalArchitect(422l, "TechnicalArchitect2");
		technicalManager2.addSubordinate(technicalArchitect2);

		TechnicalLead technicalLead2 = new TechnicalLead(522l, "TechnicalLead2");
		technicalLead2.addSubordinate(new Developer(6221l, "Developer4"));
		technicalLead2.addSubordinate(new Developer(6222l, "Developer5"));
		technicalLead2.addSubordinate(new Developer(6223l, "Developer6"));
		technicalArchitect2.addSubordinate(technicalLead2);

		return organization;
	}

}
