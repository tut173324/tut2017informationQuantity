package s4.specification;

/**
 * This interface provides the design for a frequency counter.このインタフェースは、周波数カウンタの設計を提供します。
 */
public interface FrequencerInterface {
    /**
     * 検索するデータを設定します。Set the data to search.
     *
     * @param target 検索するデータをターゲットにする the data to search
     */
    void setTarget(byte target[]);

    /**
     * 検索対象とするデータを設定します。
     * Set the data to be searched target from.
     *
     * @param space対象の検索対象データ
     * space the data to be searched target from
     */
    void setSpace(byte space[]);

    /**
     * TARGETの頻度カウントを取得します。 Get the frequency count of TARGET.
     *
     * TARGETが設定されていないか、TARGETの長さがゼロの場合は-1を返します。 
     * It returns -1 when TARGET is not set or TARGET's length is zero.
     * SPACEが設定されていないか、SPACEの長さがゼロの場合は0を返します。
     * It returns 0 when SPACE is not set or SPACE's length is zero.
     * それ以外の場合は、スペースでTAGETの頻度を取得します。
     * Otherwise, get the frequency of TAGET in SPACE.
     */
    int frequency();

    /**
     *  TARGETのsubBytesの頻度を取得します。 Get the frequency of subBytes of TARGET.
     *
     * i.e. target[start], taget[start+1], ... , target[end-1].
     * ターゲット[開始]、タグセット[開始+ 1]、...、ターゲット[終了-1]。
     * For the incorrect value of START or END, the behavior is undefined.
     * STARTまたはENDの値が正しくない場合の動作は未定義です。
     *
     * @param start
     * @param end
     */
    int subByteFrequency(int start, int end);
}

