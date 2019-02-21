/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.comskipumcommoncommon.selectable.RegionsSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class RegionsByKeyFluentHelper
    extends FluentHelperByKey<RegionsByKeyFluentHelper, Regions, RegionsSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param country_code
     *     
     * @param code
     *     
     * @param servicePath
     *     Service path to be used to fetch a single {@code Regions}
     */
    public RegionsByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String code, final String country_code) {
        super(servicePath);
        this.key.put("code", code);
        this.key.put("country_code", country_code);
    }

    @Override
    @Nonnull
    protected Class<Regions> getEntityClass() {
        return Regions.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
