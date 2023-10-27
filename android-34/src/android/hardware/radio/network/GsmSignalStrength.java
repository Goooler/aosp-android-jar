/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.radio.network;
public class GsmSignalStrength implements android.os.Parcelable
{
  public int signalStrength = 0;
  public int bitErrorRate = 0;
  public int timingAdvance = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<GsmSignalStrength> CREATOR = new android.os.Parcelable.Creator<GsmSignalStrength>() {
    @Override
    public GsmSignalStrength createFromParcel(android.os.Parcel _aidl_source) {
      GsmSignalStrength _aidl_out = new GsmSignalStrength();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public GsmSignalStrength[] newArray(int _aidl_size) {
      return new GsmSignalStrength[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(signalStrength);
    _aidl_parcel.writeInt(bitErrorRate);
    _aidl_parcel.writeInt(timingAdvance);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signalStrength = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      bitErrorRate = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      timingAdvance = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("signalStrength: " + (signalStrength));
    _aidl_sj.add("bitErrorRate: " + (bitErrorRate));
    _aidl_sj.add("timingAdvance: " + (timingAdvance));
    return "android.hardware.radio.network.GsmSignalStrength" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
