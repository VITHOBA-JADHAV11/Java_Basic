package com.vithu.copy_conts;

public class Sourcing 
{
	private int sourceId;
	private String SourceName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) 
	{
		super();
		this.sourceId = sourceId;
		SourceName = sourceName;
		this.basicSalary = basicSalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary()
	{
        double percentage = ((double) enrollmentReached / enrollmentTarget) * 100;
        return basicSalary + HRAPer + DAPer + (percentage * perkPerEnrollment);
    }

}
