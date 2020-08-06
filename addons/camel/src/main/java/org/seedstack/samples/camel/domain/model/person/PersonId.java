/*
 *  Copyright © 2013-2020, The SeedStack authors <http://seedstack.org>
 *
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *   License, v. 2.0. If a copy of the MPL was not distributed with this
 *   file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.samples.camel.domain.model.person;

import org.seedstack.business.domain.BaseValueObject;

/**
 * Person value object
 */
public class PersonId extends BaseValueObject {

    private final String email;
    public PersonId(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
