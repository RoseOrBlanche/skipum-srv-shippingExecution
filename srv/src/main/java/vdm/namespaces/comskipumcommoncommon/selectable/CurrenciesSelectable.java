/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.comskipumcommoncommon.Currencies;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies}. This interface is used by {@link vdm.namespaces.comskipumcommoncommon.field.CurrenciesField CurrenciesField} and {@link vdm.namespaces.comskipumcommoncommon.link.CurrenciesLink CurrenciesLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Currencies#NAME NAME}</li>
 * <li>{@link vdm.namespaces.comskipumcommoncommon.Currencies#CODE CODE}</li>
 * </ul>
 * 
 */
public interface CurrenciesSelectable
    extends EntitySelectable<Currencies>
{


}
