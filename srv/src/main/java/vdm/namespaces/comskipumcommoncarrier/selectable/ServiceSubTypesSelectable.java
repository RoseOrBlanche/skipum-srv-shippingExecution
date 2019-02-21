/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes ServiceSubTypes}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ServiceSubTypesField ServiceSubTypesField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ServiceSubTypesLink ServiceSubTypesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ServiceSubTypes#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ServiceSubTypesSelectable
    extends EntitySelectable<ServiceSubTypes>
{


}
