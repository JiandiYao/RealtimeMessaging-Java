/**
 * @fileoverview This file contains the class to create ortc factories
 * @author ORTC team members (ortc@ibt.pt) 
 */
package ibt.ortc.extensibility;

/**
 * Class that represents a channel subscription
 *  
 * How to use:
 * <pre>
 * subscribedChannel = new ChannelSubscription(subscribeOnReconnect, onMessageEventHandler);
 * </pre>
 * @version 2.1.0 27 Mar 2013
 * @author IBT
 * 
 */
public class ChannelSubscription {
	private boolean isSubscribing;
	private boolean isSubscribed;
	private boolean subscribeOnReconnected;
	private OnMessage onMessage;
    private OnMessageWithFilter onMessageWithFilter;
    private OnMessageWithOptions onMessageWithOptions;
    private OnMessageWithBuffer onMessageWithBuffer;
	private String filter;
    private String subscriberId;
	private boolean isWithFilter;
    private boolean isWithBuffer;
    private boolean isWithOptions;


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public boolean isWithFilter() {
        return isWithFilter;
    }

    public void setWithFilter(boolean withFilter) {
        isWithFilter = withFilter;
    }

    public OnMessageWithFilter getOnMessageWithFilter() {
        return onMessageWithFilter;
    }

    public OnMessageWithOptions getOnMessageWithOptions() { return onMessageWithOptions; }

    public OnMessageWithBuffer getOnMessageWithBuffer() { return onMessageWithBuffer; }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public boolean isWithBuffer() {
        return isWithBuffer;
    }

    public void setWithBuffer(boolean withBuffer) {
        isWithBuffer = withBuffer;
    }

    public boolean isWithOptions() { return isWithOptions; }

    public void setWithOptions(boolean withOptions) { isWithOptions = withOptions; }


    /**
	 * Creates an instance of a channel subscription
	 * @param subscribeOnReconnected Indicates if the channel should be subscribe if a reconnect happens
	 * @param onMessage Event handler that is fired when a message is received in the channel
	 */
	public ChannelSubscription(boolean subscribeOnReconnected,OnMessage onMessage){
		this.subscribeOnReconnected = subscribeOnReconnected;
		this.onMessage = onMessage;
		this.isSubscribed = false;
		this.isSubscribing = false;
	}

	/**
	 * Creates an instance of a channel subscription
	 * @param subscribeOnReconnected Indicates if the channel should be subscribe if a reconnect happens
	 * @param onMessage Event handler that is fired when a message is received in the channel
	 */
	public ChannelSubscription(boolean subscribeOnReconnected, OnMessageWithFilter onMessage){
		this.subscribeOnReconnected = subscribeOnReconnected;
		this.onMessageWithFilter = onMessage;
		this.isSubscribed = false;
		this.isSubscribing = false;
	}

    /**
     * Creates an instance of a channel subscription
     * @param subscribeOnReconnected Indicates if the channel should be subscribe if a reconnect happens
     * @param onMessage Event handler that is fired when a message is received in the channel
     */
    public ChannelSubscription(boolean subscribeOnReconnected, OnMessageWithBuffer onMessage){
        this.subscribeOnReconnected = subscribeOnReconnected;
        this.onMessageWithBuffer = onMessage;
        this.isSubscribed = false;
        this.isSubscribing = false;
    }

    /**
     * Creates an instance of a channel subscription
     * @param subscribeOnReconnected Indicates if the channel should be subscribe if a reconnect happens
     * @param onMessage Event handler that is fired when a message is received in the channel
     */
    public ChannelSubscription(boolean subscribeOnReconnected, OnMessageWithOptions onMessage){
        this.subscribeOnReconnected = subscribeOnReconnected;
        this.onMessageWithOptions = onMessage;
        this.isSubscribed = false;
        this.isSubscribing = false;
    }

	/**
	 * Indicates whether the channel is being subscribed or not
	 * @return boolean True if is subscribing the channel otherwise false
	 */
	public boolean isSubscribing() {
		return isSubscribing;
	}

	/**
	 * Changes the channel subscribing status
	 * @param isSubscribing True indicates the channel is being subscribed
	 */
	public void setSubscribing(boolean isSubscribing) {
		this.isSubscribing = isSubscribing;
	}

	/**
	 * Indicates whether the channel is subscribed or not
	 * @return boolean True if the channel is subscribed otherwise false
	 */
	public boolean isSubscribed() {
		return isSubscribed;
	}

	/**
	 * Changes the channel subscribed status
	 * @param isSubscribed True indicates the channel is being subscribed
	 */
	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}

	/**
	 * Gets the event handler that is fired when a message is received in the channel
	 * @return OnMessage event handler of a message received in the channel
	 */
	public OnMessage getOnMessage() {
		return onMessage;
	}

	/**
	 * Indicates where the channel should be subscribed if a reconnect happens
	 * @return boolean True if should be subscribed otherwise false
	 */
	public boolean subscribeOnReconnected() {
		return subscribeOnReconnected;
	}
	
	/**
	 * Indicates where the channel should be subscribed if a reconnect happens
	 */
	public void setSubscribeOnReconnected(boolean value) {
		subscribeOnReconnected = value;
	}
}
