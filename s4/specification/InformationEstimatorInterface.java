package s4.specification;

public interface InformationEstimatorInterface {
    /**
     * Set the data for computing the information quantities.
     * 情報量を計算するためのデータを設定します。
     * @param ターゲットデータ target the data
     */
    void setTarget(byte target[]);

    /**
     * Set the data for sample space to computer probability.
     * サンプル空間のデータをコンピュータ確率に設定します。
     * @param space the data
     */
    void setSpace(byte space[]);

    /**
     * 情報量を見積もります。 Estimate information quantity.
     *
     * ARGETが設定されていないか、TARGETの長さがゼロの場合は0.0を返します It returns 0.0 when the TARGET is not set or TARGET's length is zero;
     * 真値が無限大であるか、SPACEが設定されていない場合、Double.MAX_VALUEを返します It returns Double.MAX_VALUE when the true value is infinite, or SPACE is not set.
     * 真値が有限でDouble.MAX_VALUEより大きい場合の動作は未定義です The behavior is undefined if the true value is finite but larger than Double.MAX_VALUE.
     * これは、スペースが不当に大きい場合にのみ発生することに注意してください。Note that this happens only when the SPACE is unreasonably large.
     * とにかく他の問題に遭遇します。 We will encounter other problem anyway.
     * それ以外の場合は、情報量の見積もりを返します。 Otherwise, it returns the estimation of information quantity.
     */
    double estimation();
}

