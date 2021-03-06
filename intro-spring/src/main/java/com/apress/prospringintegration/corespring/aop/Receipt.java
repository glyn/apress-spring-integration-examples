/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apress.prospringintegration.corespring.aop;

public class Receipt {

    long authcode;
    float purchaseAmt;
    float discountedAmount;

    public Receipt() {
    }

    public long getAuthcode() {
        return authcode;
    }

    public void setAuthcode(long authcode) {
        this.authcode = authcode;
    }

    public float getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(float purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }

    public float getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(float discountedAmount) {
        this.discountedAmount = discountedAmount;
    }
}
