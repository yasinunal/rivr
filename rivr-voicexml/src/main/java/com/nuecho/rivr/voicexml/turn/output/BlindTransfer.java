/*
 * Copyright (c) 2004 Nu Echo Inc. All rights reserved.
 */
package com.nuecho.rivr.voicexml.turn.output;

/**
 * A <code>BlindTransfer</code> is a {@link Transfer} where the outcome
 * is not monitored.
 * <p>
 * Once the transfer begins and the interpreter disconnects from the session,
 * the platform throws connection.disconnect.transfer.
 * 
 * @author Nu Echo Inc.
 * @see <a href="http://www.w3.org/TR/voicexml20/#dml2.3.7.1">http://www.w3.org/TR/voicexml20/#dml2.3.7.1</a>
 */
public class BlindTransfer extends Transfer {
    private static final String BLIND_TRANSFER_TYPE = "blind";

    /**
     * @param name The name of this turn. Not empty.
     * @param destination The URI of the destination (telephone, IP telephony
     *            address). Not empty.
     */
    public BlindTransfer(String name, String destination) {
        super(name, destination);
    }

    @Override
    protected final String getTransferType() {
        return BLIND_TRANSFER_TYPE;
    }
}