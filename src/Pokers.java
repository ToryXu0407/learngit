
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Pokers {
	//static String[] pokers;
	public static void main(String[]args){
		String[] pokers = new String[108];
		String[] playerA = new String[25];
		String[] playerB = new String[25];
		String[] playerC = new String[25];
		String[] playerD = new String[25];
		pokers=newPokers();
		System.out.println("��ʼ���飺");
		printpokers(pokers);
		pokers = washpokers(pokers);
		System.out.println("");
		System.out.println("ϴ��֮��");
		printpokers(pokers);
		String canmou = RandomPoker();
		System.out.println("");
		System.out.println("");
		sendPokers(pokers,playerA,playerB,playerC,playerD);
		System.out.println("");
		System.out.println("����֮��");
		System.out.println("playerA���ƣ�");
		printpokers(playerA);
		System.out.println("");
		System.out.println("playerB���ƣ�");
		printpokers(playerB);
		System.out.println("");
		System.out.println("playerC���ƣ�");
		printpokers(playerC);
		System.out.println("");
		System.out.println("playerD���ƣ�");
		printpokers(playerD);
		playerA= sort(playerA,canmou);
		playerB= sort(playerB,canmou);
		playerC= sort(playerC,canmou);
		playerD= sort(playerD,canmou);
		System.out.println("");
		System.out.println("");
		System.out.println("��ı����"+canmou+"ɫ��");
		System.out.println("");
		System.out.println("����֮��");
		System.out.println("");
		System.out.println("playerA���ƣ�");
		printpokers(playerA);
		System.out.println("");
		System.out.println("playerB���ƣ�");
		printpokers(playerB);
		System.out.println("");
		System.out.println("playerC���ƣ�");
		printpokers(playerC);
		System.out.println("");
		System.out.println("playerD���ƣ�");
		printpokers(playerD);
		
	}





private static String[] sort(String[] player,String color) {
		// TODO �Զ����ɵķ������
	
	if(color == "����"){
		String[] defined = {"����5","Joker","joker","����3","�ݻ�3","����2","����2","�ݻ�2","����2"
				,"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3",
				"�ݻ�A","�ݻ�K","�ݻ�Q","�ݻ�J","�ݻ�10","�ݻ�9","�ݻ�8","�ݻ�7","�ݻ�6","�ݻ�5","�ݻ�4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
		}
	else if(color == "�ݻ�"){
		String[] defined = {"����5","Joker","joker","�ݻ�3","����3","�ݻ�2","����2","����2","����2",
				"�ݻ�A","�ݻ�K","�ݻ�Q","�ݻ�J","�ݻ�10","�ݻ�9","�ݻ�8","�ݻ�7","�ݻ�6","�ݻ�5","�ݻ�4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
		}
	else if (color =="����"){
		String[] defined = {"����5","Joker","joker","����3","����3","����2","����2","�ݻ�2","����2",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3",
				"�ݻ�A","�ݻ�K","�ݻ�Q","�ݻ�J","�ݻ�10","�ݻ�9","�ݻ�8","�ݻ�7","�ݻ�6","�ݻ�5","�ݻ�4","�ݻ�3",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4"};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
	}
	else if (color =="����"){
		String[] defined = {"����5","Joker","joker","����3","����3","����2","����2","����2","�ݻ�2",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4","����3",
				"����A","����K","����Q","����J","����10","����9","����8","����7","����6","����5","����4",
				"�ݻ�A","�ݻ�K","�ݻ�Q","�ݻ�J","�ݻ�10","�ݻ�9","�ݻ�8","�ݻ�7","�ݻ�6","�ݻ�5","�ݻ�4","�ݻ�3",
				};
		final List<String> definedOrder = Arrays.asList(defined);
		List<String> toBeOrderedList = Arrays.asList(player);
		Collections.sort(toBeOrderedList, new Comparator<String>()
		{
		    public int compare(String o1, String o2)
		    {
		        int io1 = definedOrder.indexOf(o1);
		        int io2 = definedOrder.indexOf(o2);
		        return io1 - io2;
		    }
		});
	}
	
	
	
		return player;
	}





private static void sendPokers(String[] pokers,String[] playerA,String[] playerB,String[] playerC,String[] playerD) {
		// TODO �Զ����ɵķ������
		for(int i = 0;i<25;i++){
			playerA[i]=pokers[i*4];
			playerB[i]=pokers[i*4+1];
			playerC[i]=pokers[i*4+2];
			playerD[i]=pokers[i*4+3];
		}
	}

private static String[] washpokers(String[] pokers) {
		// TODO �Զ����ɵķ������
		int index;
		String[] pokers1 = new String[pokers.length];
		boolean[] mark = new boolean[pokers.length];
		Random rd = new Random();
		for(int i =0;i<pokers.length;i++){
			index = rd.nextInt(pokers.length);
			if(mark[index]==false){
				pokers1[i]=pokers[index];
				mark[index]=true;
			}
			else
				i--;
		}
		return pokers1;
	}

private static String RandomPoker() {
		// TODO �Զ����ɵķ������
		Random rd = new Random();
		String color = null;
		int id = rd.nextInt(5);
		if(id==1)
			color = "����";
		else if(id==2)
			color = "����";
		else if(id==3)
			color = "�ݻ�";
		else if(id==4)
			color = "����";
		return color;
	}

private static void printpokers(String[] pokers) {
		// TODO �Զ����ɵķ������
	System.out.print("��ǰ����Ϊ��");
		for(int i =0;i<pokers.length;i++){
			if(i%25==0)
				System.out.println("");
			System.out.print(pokers[i]+" ");
		}
	}
private static String[] newPokers() {
		// TODO �Զ����ɵķ������
	int i = 0;
	int j =0;
	String[] poker = new String[108];
	String[] color = {"����","����","�ݻ�","����"};
	String[] poke = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] wang = {"joker","Joker"};
	for(i =0;i<13;i++){
			poker[i*4]=color[0]+poke[i];
			poker[i*4+1]=color[1]+poke[i];
			poker[i*4+2]=color[2]+poke[i];
			poker[i*4+3]=color[3]+poke[i];
		}
	for(i =13;i<26;i++){
		poker[i*4]=color[0]+poke[i-13];
		poker[i*4+1]=color[1]+poke[i-13];
		poker[i*4+2]=color[2]+poke[i-13];
		poker[i*4+3]=color[3]+poke[i-13];
	}
	System.arraycopy(wang, 0, poker, i*4, 2);
	System.arraycopy(wang, 0, poker, i*4+2, 2);
	return poker;
	}
//��װ���Ĺ��ˡ�
}