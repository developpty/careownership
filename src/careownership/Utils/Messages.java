package careownership.Utils;

public class Messages {
	
	private Exception mException;
	private String mMessage;
	private boolean mStatus;
	
	
	public Messages()
	{}
	
	public Messages(String message, boolean status, Exception ex)
	{
		mMessage = message;
		mStatus = status;
		mException = ex;
	}
	
	
	public Exception getException() {
		return mException;
	}

	public void setException(Exception mExeException) {
		this.mException = mExeException;
	}

	public String getmMessage() {
		return mMessage;
	}

	public void setmMessage(String mMessage) {
		this.mMessage = mMessage;
	}

	public boolean ismStatus() {
		return mStatus;
	}

	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}

	@Override
	public String toString() {
		
		String errorValue= (mException==null)?"":mException.toString();
		return "Messages [mExeException=" + errorValue + ", mMessage="
				+ mMessage + ", mStatus=" + mStatus + "]";
	}
	
	

}
