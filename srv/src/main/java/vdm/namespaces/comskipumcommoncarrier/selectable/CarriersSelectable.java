/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncarrier.Carriers;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncarrier.Carriers Carriers}. This interface is used by {@link vdm.namespaces.comskipumcommoncarrier.field.CarriersField CarriersField} and {@link vdm.namespaces.comskipumcommoncarrier.link.CarriersLink CarriersLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#CODE CODE}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#LOGO_URL LOGO_URL}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#SITE_URL SITE_URL}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#ENABLED ENABLED}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#TO_SERVICES TO_SERVICES}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#TO_ACTIONS TO_ACTIONS}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncarrier.Carriers#TO_FEEDS TO_FEEDS}</li>
 * </ul>
 * 
 */
public interface CarriersSelectable
    extends EntitySelectable<Carriers>
{


}
