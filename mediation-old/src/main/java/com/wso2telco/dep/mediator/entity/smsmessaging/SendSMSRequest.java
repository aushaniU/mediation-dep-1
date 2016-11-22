/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package com.wso2telco.dep.mediator.entity.smsmessaging;

import javax.xml.bind.annotation.XmlRootElement;

 
// TODO: Auto-generated Javadoc

/**
 * The Class SendSMSRequest.
 */
@XmlRootElement(name = "outboundSMSMessageRequest")
public class SendSMSRequest implements ISMSresponse {
    
    /** The outbound sms message request. */
    private OutboundSMSMessageRequest outboundSMSMessageRequest;
    
    /**
     * Instantiates a new send sms request.
     */
    public SendSMSRequest() {
    }


    /**
     * Gets the outbound sms message request.
     *
     * @return the outbound sms message request
     */
    public OutboundSMSMessageRequest getOutboundSMSMessageRequest() {
            return outboundSMSMessageRequest;
    }


    /**
     * Sets the outbound sms message request.
     *
     * @param receiptRequest the new outbound sms message request
     */
    public void setOutboundSMSMessageRequest(String receiptRequest) {
            this.outboundSMSMessageRequest = outboundSMSMessageRequest;
    }
    
}
