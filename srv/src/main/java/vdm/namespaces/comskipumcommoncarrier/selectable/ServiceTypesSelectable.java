/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.ServiceTypes;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes ServiceTypes}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ServiceTypesField ServiceTypesField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ServiceTypesLink ServiceTypesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.ServiceTypes#CODE CODE}</li>
 * </ul>
 * 
 */
public interface ServiceTypesSelectable
    extends EntitySelectable<ServiceTypes>
{


}
