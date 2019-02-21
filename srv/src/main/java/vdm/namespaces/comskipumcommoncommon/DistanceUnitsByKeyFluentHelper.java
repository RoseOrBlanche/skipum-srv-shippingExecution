/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.comskipumcommoncommon.selectable.DistanceUnitsSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class DistanceUnitsByKeyFluentHelper
    extends FluentHelperByKey<DistanceUnitsByKeyFluentHelper, DistanceUnits, DistanceUnitsSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param code
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code DistanceUnits}
     */
    public DistanceUnitsByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String code) {
        super(servicePath);
        this.key.put("code", code);
    }

    @Override
    @Nonnull
    protected Class<DistanceUnits> getEntityClass() {
        return DistanceUnits.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
