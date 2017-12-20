package s4.b173324; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

/*周波数カウンタ
interface FrequencerInterface {     // このインタフェースは、周波数カウンタの設計を提供します。
    void setTarget(byte[]  target); // 検索するデータを設定します。
    void setSpace(byte[]  space);  // 検索対象となるデータを設定します。
    int frequency(); /TARGETが設定されていないか、TARGETの長さがゼロの場合は-1を返します
                    //それ以外の場合は、SPACEが設定されていないか、スペースの長さがゼロの場合は0を返します。
                    //それ以外の場合は、SPACEのTAGETの頻度を取得します。
    int subByteFrequency(int start, int end);
    // tagetのsubByteの頻度、つまりtarget [start]、taget [start + 1]、...、target [end-1]を取得します。
    // STARTまたはENDの値が正しくない場合の動作は未定義です。
*/
/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
    void setTarget(byte[]  target); // set the data to search.　
    void setSpace(byte[]  space);  // set the data to be searched target from.　
    int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
                    //Otherwise, it return 0, when SPACE is not set or Space's length is zero
                    //Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
*/



public class Frequencer implements FrequencerInterface{
    // Code to Test, *warning: This code  contains intentional problem*
    //テストするコード、*警告：このコードには意図的な問題が含まれています*
    byte [] myTarget ;//={-1};
    byte [] mySpace ;//={0};
    public void setTarget(byte [] target) { myTarget = target;}
    public void setSpace(byte []space) { mySpace = space; }
    public int frequency() {
        if(myTarget == null){
            return -1;
        }
        if(mySpace == null){
            return 0;
        }
	int targetLength = myTarget.length;
	int spaceLength = mySpace.length;
	int count = 0;
    if(targetLength == 0){
        return -1;
    }
    if(spaceLength == 0){
        return 0;
    }
	for(int start = 0; start<spaceLength; start++) { // Is it OK?
	    boolean abort = false;
	    for(int i = 0; i<targetLength; i++) {
		if(myTarget[i] != mySpace[start+i]) { abort = true; break; }
	    }
	    if(abort == false) { count++; }
	}
	return count;
    }

    // I know that here is a potential problem in the declaration.
    //ここに宣言の潜在的な問題があることはわかっています。
    public int subByteFrequency(int start, int length) { 
	// Not yet, but it is not currently used by anyone.
    // まだ、しかし誰にも使われていません。



	return -1;
    }

    public static void main(String[] args) {
	Frequencer myObject;
	int freq;
	try {
	    System.out.println("checking my Frequencer");
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}
    }
}	    
	    
