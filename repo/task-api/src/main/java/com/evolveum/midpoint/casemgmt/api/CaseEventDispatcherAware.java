/*
 * Copyright (c) 2010-2017 Evolveum and contributors
 *
 * This work is dual-licensed under the Apache License 2.0
 * and European Union Public License. See LICENSE file for details.
 */

package com.evolveum.midpoint.casemgmt.api;

public interface CaseEventDispatcherAware {

    void setDispatcher(CaseEventDispatcher dispatcher);

    CaseEventDispatcher getDispatcher();

}
