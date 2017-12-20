package s4.b173324; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;


//テストケースを追加するのが課題


public class TestCase {
    public static void main(String[] args) {
    	
	//FrequencerInterface のテスト

	try{//TARGETが設定されていない  -> -1
		FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\nchecking s4.b173324.Frequencer \n  TARGETが設定されていない  -> -1");
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try{//TARGETの長さがゼロ  -> -1
		FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\n  TARGETの長さがゼロ  -> -1");
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try{//SPACEが設定されていない -> 0
		FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\n  SPACEが設定されていない -> 0");
	    myObject = new s4.b173324.Frequencer();
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try{//SPACEが長さ0 -> 0
		FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\n  SPACE長さ0 -> 0");
	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }

	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	

	try {//subBytes start異常　-> 未定義
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\n  subBytes start異常　-> 未定義");


	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.subByteFrequency(-1,9);
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" subBytes is  "+freq);
	    //System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    //if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }	    
	    System.out.println("");
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}
	try {//subBytes end異常　-> 未定義
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("\n  subBytes start異常　-> 未定義");


	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.subByteFrequency(0,10000000);
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" subBytes is  "+freq);
	    //System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    //if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }	    
	    System.out.println("\n");
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

	

	try {//それ以外の場合
	    FrequencerInterface  myObject;
	    int freq,nn;
	    System.out.println("\n  通常時:subBytes(0,9)");


	    myObject = new s4.b173324.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    nn = myObject.subByteFrequency(0,9);
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); } 
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" subBytes is  "+nn);
	    System.out.println("\n");
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}


	//InformationEstimatorInterfaceのテスト

	try {//TARGETが設定されていない　-> 0.0
	    InformationEstimatorInterface myObject1;
	    double value;
	    System.out.println("\nchecking s4.b173324.InformationEstimator\n  TARGETが設定されていない　-> 0.0");
	    
	    myObject1 = new s4.b173324.InformationEstimator();
	    myObject1.setSpace("3210321001230123".getBytes());
	    value = myObject1.estimation();
	    System.out.println(">null "+value);
	    if(0.0 == value) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try {//TARGETの長さがゼロ -> 0.0
		InformationEstimatorInterface myObject1;
	    double value;
	    System.out.println("\n  TARGETの長さがゼロ -> 0.0");
	    
	    myObject1 = new s4.b173324.InformationEstimator();
	    myObject1.setSpace("3210321001230123".getBytes());
	    myObject1.setTarget("".getBytes());
	    value = myObject1.estimation();
	    System.out.println("> "+value);
	    if(0.0 == value) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try {//true value が無限大  -> Double.MAX_VALUE 
		InformationEstimatorInterface myObject1;
	    double value;
	    System.out.println("\n  true value が無限大  -> Double.MAX_VALUE");
	    
	    myObject1 = new s4.b173324.InformationEstimator();
	    myObject1.setSpace( "234".getBytes());
	    myObject1.setTarget("90847177208462620486094".getBytes());
	    value = myObject1.estimation();
	    System.out.println("> "+value);
	    if(Double.MAX_VALUE <= value) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}


	try {//SPACEが設定されていない  -> Double.MAX_VALUE 
		InformationEstimatorInterface myObject2;
	    double value;
	    System.out.println("\n  SPACEが設定されていない  -> Double.MAX_VALUE");
	    
	    myObject2 = new s4.b173324.InformationEstimator();
	    myObject2.setTarget("00".getBytes());
	    value = myObject2.estimation();
	    System.out.println(">00(No Spase) "+value);
	    if(Double.MAX_VALUE == value) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	try {//通常
		InformationEstimatorInterface myObject1;
	    double value;
	    System.out.println("\n  通常");
	    
	    myObject1 = new s4.b173324.InformationEstimator();
	    myObject1.setSpace("3210321001230123".getBytes());
	    myObject1.setTarget("0".getBytes());
	    value = myObject1.estimation();
	    System.out.println("3210321001230123 > "+value);
	    if(2 == value) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}catch(Exception e){
		System.out.println("Exception occurred: STOP");
	}

	

	

    }
}	    
	    
