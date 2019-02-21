/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.Services;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.Services Services}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.ServicesField ServicesField} and {@link vdm.namespaces.comskipumcommoncarrier.link.ServicesLink ServicesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#CODE CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#ENABLED ENABLED}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#MODE_OF_TRANSPORT_CODE MODE_OF_TRANSPORT_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#SERVICE_TYPE_CODE SERVICE_TYPE_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#SERVICE_SUB_TYPE_CODE SERVICE_SUB_TYPE_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#CARRIER_CODE CARRIER_CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#TO_MODE_OF_TRANSPORT TO_MODE_OF_TRANSPORT}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#TO_SERVICE_TYPE TO_SERVICE_TYPE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#TO_SERVICE_SUB_TYPE TO_SERVICE_SUB_TYPE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Services#TO_CARRIER TO_CARRIER}</li>
 * </ul>
 * 
 */
public interface ServicesSelectable
    extends EntitySelectable<Services>
{


}
