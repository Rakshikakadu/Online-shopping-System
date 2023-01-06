package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Report;
import com.ecom.Exception.ReportException;

public interface ReportService {
	public Report addReport(Report report) throws ReportException;

	public Report deleteReport(Integer reportId) throws ReportException;

	public Report findByReportId(Integer reportId) throws ReportException;

	public List<Report> viewAllReports() throws ReportException;
}
