import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ��¼ϵͳ {
	public void add() {
		Map<String, String> list = new HashMap<String, String>();
		System.out.println("ע��ϵͳ");

		while (true) {
			System.out.println("�Ƿ�ע���˺�");
			String an = new Scanner(System.in).next();
			if ("��".equals(an)) {
				System.out.println("�����������õĵ��˺ţ�");
				String zh = new Scanner(System.in).next();
				System.out.print("������һ����Ч���룺 ");
				String password = new Scanner(System.in).next();
				���� in = new ����(password);
				list.put(zh, password);
			} else {
				break;
			}
		}
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
//		
//		try {
//			String line = System.getProperty("line.separator");
//			StringBuffer str = new StringBuffer();
//			FileWriter fw = new FileWriter("C:\\Users\\11249\\Desktop\\�½��ı��ĵ�.txt", true);
//			Set set = list.entrySet();
//			Iterator iter = set.iterator();
//			while(iter.hasNext()){
//			Map.Entry entry = (Map.Entry)iter.next();
//			str.append(entry.getKey()+" : "+entry.getValue()).append(line);
//			}
//			fw.write(str.toString());
//			fw.close();
//			} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}

		qweqw qw = new qweqw();
		qw.write(list);
		
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		System.out.println("��¼ϵͳ");
		System.out.println("�����������˺�");
		while (flag3) {
			String dlzh = new Scanner(System.in).next();
			for (Map.Entry<String, String> a : list.entrySet()) {
				if (a.getKey().equals(dlzh)) {
					System.out.println("�������������룺");
					String mima = list.get(dlzh);
					while (flag2) {
						String mm = new Scanner(System.in).next();
						if (mima.equals(mm)) {
							System.out.println("������ȷ����½�ɹ�");
							flag3 = false;
							flag2 = false;
							flag=false;
						} else {
							System.out.println("�����������������");
						}
					}
				} 
			}
			if (flag) {
				System.out.println("���˺Ų�����");
					
			}
			
		}
	}

	public static void main(String[] args) {
		��¼ϵͳ asd = new ��¼ϵͳ();
		asd.add();
	}
}
