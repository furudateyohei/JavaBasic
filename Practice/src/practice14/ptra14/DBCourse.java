package practice14.ptra14;

public class DBCourse implements practice14.common.Course{
	public String getCourseName() {
		return  PREFIX + "DB基礎";
	}
	public String[] getCourseUnit() {
		String[]list = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return list;
	}
}
