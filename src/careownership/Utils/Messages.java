package careownership.Utils;

public class Messages {
	
	private Exception mException;
	private String mMessage;
	private boolean mStatus;
	private Object returnData;
	
	
	public Messages()
	{
		mMessage="";
	}
	
	public Messages(String message, boolean status,Exception ex)
	{
		mMessage = message;
		mStatus = status;
		mException = ex;
	}
	
	public Messages(String message, boolean status,Object retData,Exception ex)
	{
		mMessage = message;
		mStatus = status;
		mException = ex;
		setReturnData(retData);
	}
	
	
	public Exception getException() {
		return mException;
	}

	public void setException(Exception mExeException) {
		this.mException = mExeException;
	}

	public String getMessage() {
		return mMessage;
	}

	public void setMessage(String mMessage) {
		this.mMessage = mMessage;
	}

	public boolean isStatus() {
		return mStatus;
	}

	public void setStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}

	@Override
	public String toString() {
		
		String errorValue= (mException==null)?"":mException.toString();
		return "Messages [mExeException=" + errorValue + ", mMessage="
				+ mMessage + ", mStatus=" + mStatus + "]";
	}

	public Object getReturnData() {
		return returnData;
	}

	public void setReturnData(Object returnData) {
		this.returnData = returnData;
	}
	
	

}
