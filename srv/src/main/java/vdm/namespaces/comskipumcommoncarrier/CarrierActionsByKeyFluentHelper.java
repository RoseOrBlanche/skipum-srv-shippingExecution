/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.comskipumcommoncarrier.selectable.CarrierActionsSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CarrierActionsByKeyFluentHelper
    extends FluentHelperByKey<CarrierActionsByKeyFluentHelper, CarrierActions, CarrierActionsSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.comskipumcommoncarrier.CarrierActions CarrierActions} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param actionCode_code
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code CarrierActions}
     * @param carrier_code
     *     
     */
    public CarrierActionsByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String actionCode_code, final String carrier_code) {
        super(servicePath);
        this.key.put("actionCode_code", actionCode_code);
        this.key.put("carrier_code", carrier_code);
    }

    @Override
    @Nonnull
    protected Class<CarrierActions> getEntityClass() {
        return CarrierActions.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
