package Bean;

public class Tools {

	/**
	 * ����1�������ַ�ת��
	 */
	public static String CodeToChinese(String str) {
		if (str!=null){
			try{
				String tempString=str;
				byte[] tempB=tempString.getBytes("ISO-8859-1");
				tempString=new String(tempB,"utf-8");
				return tempString;
			}catch(Exception e){
				e.printStackTrace();
				return "";
			}
		}else{
			return "";
		}
		

	}

}
