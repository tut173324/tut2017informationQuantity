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

/*日本語
public interface InformationEstimatorInterface{
    void setTarget(byte target[]); // 情報量を計算するためのデータを設定する
    void setSpace(byte space[]); // サンプル空間のデータをコンピュータ確率に設定する
    double estimation(); //ターゲットが設定されていないか、ターゲットの長さがゼロの場合は0.0を返します。
	// true値が無限大の場合、または空白が設定されていない場合は、Double.MAX_VALUEを返します。
	// true値がfineteでDouble.MAX_VALUEより大きい場合の動作は未定義です。
	// Note that this happens only when the space is unreasonably large. We will encounter other problem anyway.
	// Otherwise, estimation of information quantity, 
}     
*/
//テストケースを追加するのが課題


public class TestCase {
    public static void main(String[] args) {
    	
	try {//FrequencerInterface のテスト
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("checking s4.b173324.Frequencer");


	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	    //ターゲットが設定されていないか、
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    //myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	    //ターゲットの長さがゼロの場合は0.0を返します。
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	    


	    // true値が無限大の場合、または空白が設定されていない場合は、Double.MAX_VALUEを返します。
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("HiHoHiHo".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"HiHoHiHo\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	    // true値がfineteでDouble.MAX_VALUEより大きい場合の動作は未定義です。

	    System.out.println("\n");
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

	try {//InformationEstimatorInterfaceのテスト
	    InformationEstimatorInterface myObject,myObject1,myObject2;
	    double value;
	    System.out.println("checking s4.b173324.InformationEstimator");

	    

	    //TARGETが設定されていないか、
	    myObject1 = new s4.b173324.InformationEstimator();
	    myObject1.setSpace("3210321001230123".getBytes());
	    value = myObject1.estimation();
	    System.out.println(">null "+value);
	    //TARGETの長さがゼロの場合は-1を返します
	    myObject1.setTarget("".getBytes());
	    value = myObject1.estimation();
	    System.out.println("> "+value);
	    //SPACEが設定されていないか、
	    myObject2 = new s4.b173324.InformationEstimator();
	    myObject2.setTarget("00".getBytes());
	    value = myObject2.estimation();
	    System.out.println(">00(No Spase) "+value);
	    //スペースの長さがゼロの場合は0を返します。
	    myObject2.setSpace("".getBytes());
	    myObject2.setTarget("00".getBytes());
	    value = myObject2.estimation();
	    System.out.println(">00(Zero Spase) "+value);

	    // STARTまたはENDの値が正しくない場合の動作は未定義です。

	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

    }
}	    
	    
