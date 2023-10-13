package in.rahul.daofactory;

import in.rahul.dao.IStudentDao;
import in.rahul.dao.StudentDaoImpl;
public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
