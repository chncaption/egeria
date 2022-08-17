/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetlineage.util;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ClockService {

    private Clock clock;

    public ClockService(Clock clock) {
        this.clock = clock;
    }

    public Date getNow() {
        return Date.from(LocalDate.now(clock).atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
