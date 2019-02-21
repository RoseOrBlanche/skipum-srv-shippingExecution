/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncarrier;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;
import vdm.namespaces.comskipumcommoncarrier.field.CarriersField;
import vdm.namespaces.comskipumcommoncarrier.link.CarriersLink;
import vdm.namespaces.comskipumcommoncarrier.selectable.CarriersSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>Carriers</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Carriers
    extends VdmEntity<Carriers>
{

    /**
     * Selector for all available fields of Carriers.
     * 
     */
    public final static CarriersSelectable ALL_FIELDS = new CarriersSelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     
     */
    @SerializedName("name")
    @JsonProperty("name")
    @Nullable
    @ODataField(odataName = "name")
    private String name;
    /**
     * Use with available fluent helpers to apply the <b>name</b> field to query operations.
     * 
     */
    public final static CarriersField<String> NAME = new CarriersField<String>("name");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @param code
     *     
     */
    @Key
    @SerializedName("code")
    @JsonProperty("code")
    @Nullable
    @ODataField(odataName = "code")
    private String code;
    /**
     * Use with available fluent helpers to apply the <b>code</b> field to query operations.
     * 
     */
    public final static CarriersField<String> CODE = new CarriersField<String>("code");
    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>logo_url</b></p>
     * 
     * @param logo_url
     *     
     */
    @SerializedName("logo_url")
    @JsonProperty("logo_url")
    @Nullable
    @ODataField(odataName = "logo_url")
    private String logo_url;
    /**
     * Use with available fluent helpers to apply the <b>logo_url</b> field to query operations.
     * 
     */
    public final static CarriersField<String> LOGO_URL = new CarriersField<String>("logo_url");
    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>site_url</b></p>
     * 
     * @param site_url
     *     
     */
    @SerializedName("site_url")
    @JsonProperty("site_url")
    @Nullable
    @ODataField(odataName = "site_url")
    private String site_url;
    /**
     * Use with available fluent helpers to apply the <b>site_url</b> field to query operations.
     * 
     */
    public final static CarriersField<String> SITE_URL = new CarriersField<String>("site_url");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>enabled</b></p>
     * 
     * @param enabled
     *     
     */
    @SerializedName("enabled")
    @JsonProperty("enabled")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "enabled")
    private Boolean enabled;
    /**
     * Use with available fluent helpers to apply the <b>enabled</b> field to query operations.
     * 
     */
    public final static CarriersField<Boolean> ENABLED = new CarriersField<Boolean>("enabled");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>services</b> for <b>Carriers</b> to multiple <b>Services</b>.
     * 
     */
    @SerializedName("services")
    @JsonProperty("services")
    @ODataField(odataName = "services")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Services> toServices;
    /**
     * Navigation property <b>actions</b> for <b>Carriers</b> to multiple <b>CarrierActions</b>.
     * 
     */
    @SerializedName("actions")
    @JsonProperty("actions")
    @ODataField(odataName = "actions")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CarrierActions> toActions;
    /**
     * Navigation property <b>feeds</b> for <b>Carriers</b> to multiple <b>CarrierFeeds</b>.
     * 
     */
    @SerializedName("feeds")
    @JsonProperty("feeds")
    @ODataField(odataName = "feeds")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CarrierFeeds> toFeeds;
    /**
     * Use with available fluent helpers to apply the <b>services</b> navigation property to query operations.
     * 
     */
    public final static CarriersLink<Services> TO_SERVICES = new CarriersLink<Services>("services");
    /**
     * Use with available fluent helpers to apply the <b>actions</b> navigation property to query operations.
     * 
     */
    public final static CarriersLink<CarrierActions> TO_ACTIONS = new CarriersLink<CarrierActions>("actions");
    /**
     * Use with available fluent helpers to apply the <b>feeds</b> navigation property to query operations.
     * 
     */
    public final static CarriersLink<CarrierFeeds> TO_FEEDS = new CarriersLink<CarrierFeeds>("feeds");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Carriers> getType() {
        return Carriers.class;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     
     */
    public void setName(
        @Nullable
        final String name) {
        rememberChangedField("Name", this.name);
        this.name = name;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>code</b></p>
     * 
     * @param code
     *     
     */
    public void setCode(
        @Nullable
        final String code) {
        rememberChangedField("Code", this.code);
        this.code = code;
    }

    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>logo_url</b></p>
     * 
     * @param logo_url
     *     
     */
    public void setLogo_url(
        @Nullable
        final String logo_url) {
        rememberChangedField("Logo_url", this.logo_url);
        this.logo_url = logo_url;
    }

    /**
     * Constraints: Not nullable, Maximum length: 200 <p>Original property name from the Odata EDM: <b>site_url</b></p>
     * 
     * @param site_url
     *     
     */
    public void setSite_url(
        @Nullable
        final String site_url) {
        rememberChangedField("Site_url", this.site_url);
        this.site_url = site_url;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>enabled</b></p>
     * 
     * @param enabled
     *     
     */
    public void setEnabled(
        @Nullable
        final Boolean enabled) {
        rememberChangedField("Enabled", this.enabled);
        this.enabled = enabled;
    }

    @Override
    protected String getEntityCollection() {
        return "Carriers";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("code", getCode());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("name", getName());
        values.put("code", getCode());
        values.put("logo_url", getLogo_url());
        values.put("site_url", getSite_url());
        values.put("enabled", getEnabled());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("code")) {
                final Object value = values.remove("code");
                if ((value == null)||(!value.equals(getCode()))) {
                    setCode(((String) value));
                }
            }
            if (values.containsKey("logo_url")) {
                final Object value = values.remove("logo_url");
                if ((value == null)||(!value.equals(getLogo_url()))) {
                    setLogo_url(((String) value));
                }
            }
            if (values.containsKey("site_url")) {
                final Object value = values.remove("site_url");
                if ((value == null)||(!value.equals(getSite_url()))) {
                    setSite_url(((String) value));
                }
            }
            if (values.containsKey("enabled")) {
                final Object value = values.remove("enabled");
                if ((value == null)||(!value.equals(getEnabled()))) {
                    setEnabled(((Boolean) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("services")) {
                final Object value = (values).remove("services");
                if (value instanceof Iterable) {
                    if (toServices == null) {
                        toServices = Lists.newArrayList();
                    } else {
                        toServices = Lists.newArrayList(toServices);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        Services entity;
                        if (toServices.size()>i) {
                            entity = toServices.get(i);
                        } else {
                            entity = new Services();
                            toServices.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("actions")) {
                final Object value = (values).remove("actions");
                if (value instanceof Iterable) {
                    if (toActions == null) {
                        toActions = Lists.newArrayList();
                    } else {
                        toActions = Lists.newArrayList(toActions);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CarrierActions entity;
                        if (toActions.size()>i) {
                            entity = toActions.get(i);
                        } else {
                            entity = new CarrierActions();
                            toActions.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("feeds")) {
                final Object value = (values).remove("feeds");
                if (value instanceof Iterable) {
                    if (toFeeds == null) {
                        toFeeds = Lists.newArrayList();
                    } else {
                        toFeeds = Lists.newArrayList(toFeeds);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CarrierFeeds entity;
                        if (toFeeds.size()>i) {
                            entity = toFeeds.get(i);
                        } else {
                            entity = new CarrierFeeds();
                            toFeeds.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >CarriersField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CarriersField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >CarriersField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CarriersField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toServices!= null) {
            (values).put("services", toServices);
        }
        if (toActions!= null) {
            (values).put("actions", toActions);
        }
        if (toFeeds!= null) {
            (values).put("feeds", toFeeds);
        }
        return values;
    }

    /**
     * Fetches the <b>Services</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>services</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>Services</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<Services> fetchServices()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Services.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("services");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<Services> entityList = result.asList(Services.class);
        for (Services entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>Services</b> entities (one to many). This corresponds to the OData navigation property <b>services</b>.
     * <p>
     * If the navigation property <b>services</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Services</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<Services> getServicesOrFetch()
        throws ODataException
    {
        if (toServices == null) {
            toServices = fetchServices();
        }
        return toServices;
    }

    /**
     * Retrieval of associated <b>Services</b> entities (one to many). This corresponds to the OData navigation property <b>services</b>.
     * <p>
     * If the navigation property for an entity <b>Carriers</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>services</b> is already loaded, the result will contain the <b>Services</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<Services>> getServicesIfPresent() {
        return Optional.ofNullable(toServices);
    }

    /**
     * Overwrites the list of associated <b>Services</b> entities for the loaded navigation property <b>services</b>.
     * <p>
     * If the navigation property <b>services</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>Services</b> entities.
     */
    public void setServices(
        @Nonnull
        final List<Services> value) {
        if (toServices == null) {
            toServices = Lists.newArrayList();
        }
        toServices.clear();
        toServices.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>Services</b> entities. This corresponds to the OData navigation property <b>services</b>.
     * <p>
     * If the navigation property <b>services</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>Services</b> entities.
     */
    public void addServices(Services... entity) {
        if (toServices == null) {
            toServices = Lists.newArrayList();
        }
        toServices.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CarrierActions</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>actions</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CarrierActions</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CarrierActions> fetchActions()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CarrierActions.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("actions");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CarrierActions> entityList = result.asList(CarrierActions.class);
        for (CarrierActions entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CarrierActions</b> entities (one to many). This corresponds to the OData navigation property <b>actions</b>.
     * <p>
     * If the navigation property <b>actions</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CarrierActions</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CarrierActions> getActionsOrFetch()
        throws ODataException
    {
        if (toActions == null) {
            toActions = fetchActions();
        }
        return toActions;
    }

    /**
     * Retrieval of associated <b>CarrierActions</b> entities (one to many). This corresponds to the OData navigation property <b>actions</b>.
     * <p>
     * If the navigation property for an entity <b>Carriers</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>actions</b> is already loaded, the result will contain the <b>CarrierActions</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CarrierActions>> getActionsIfPresent() {
        return Optional.ofNullable(toActions);
    }

    /**
     * Overwrites the list of associated <b>CarrierActions</b> entities for the loaded navigation property <b>actions</b>.
     * <p>
     * If the navigation property <b>actions</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CarrierActions</b> entities.
     */
    public void setActions(
        @Nonnull
        final List<CarrierActions> value) {
        if (toActions == null) {
            toActions = Lists.newArrayList();
        }
        toActions.clear();
        toActions.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CarrierActions</b> entities. This corresponds to the OData navigation property <b>actions</b>.
     * <p>
     * If the navigation property <b>actions</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CarrierActions</b> entities.
     */
    public void addActions(CarrierActions... entity) {
        if (toActions == null) {
            toActions = Lists.newArrayList();
        }
        toActions.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CarrierFeeds</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>feeds</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CarrierFeeds</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CarrierFeeds> fetchFeeds()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CarrierFeeds.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("code=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(code));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("feeds");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CarrierFeeds> entityList = result.asList(CarrierFeeds.class);
        for (CarrierFeeds entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CarrierFeeds</b> entities (one to many). This corresponds to the OData navigation property <b>feeds</b>.
     * <p>
     * If the navigation property <b>feeds</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CarrierFeeds</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CarrierFeeds> getFeedsOrFetch()
        throws ODataException
    {
        if (toFeeds == null) {
            toFeeds = fetchFeeds();
        }
        return toFeeds;
    }

    /**
     * Retrieval of associated <b>CarrierFeeds</b> entities (one to many). This corresponds to the OData navigation property <b>feeds</b>.
     * <p>
     * If the navigation property for an entity <b>Carriers</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>feeds</b> is already loaded, the result will contain the <b>CarrierFeeds</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CarrierFeeds>> getFeedsIfPresent() {
        return Optional.ofNullable(toFeeds);
    }

    /**
     * Overwrites the list of associated <b>CarrierFeeds</b> entities for the loaded navigation property <b>feeds</b>.
     * <p>
     * If the navigation property <b>feeds</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CarrierFeeds</b> entities.
     */
    public void setFeeds(
        @Nonnull
        final List<CarrierFeeds> value) {
        if (toFeeds == null) {
            toFeeds = Lists.newArrayList();
        }
        toFeeds.clear();
        toFeeds.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CarrierFeeds</b> entities. This corresponds to the OData navigation property <b>feeds</b>.
     * <p>
     * If the navigation property <b>feeds</b> of a queried <b>Carriers</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CarrierFeeds</b> entities.
     */
    public void addFeeds(CarrierFeeds... entity) {
        if (toFeeds == null) {
            toFeeds = Lists.newArrayList();
        }
        toFeeds.addAll(Lists.newArrayList(entity));
    }

    public final static class CarriersBuilder {

        private List<Services> toServices = Lists.newArrayList();
        private List<CarrierActions> toActions = Lists.newArrayList();
        private List<CarrierFeeds> toFeeds = Lists.newArrayList();

        private Carriers.CarriersBuilder toServices(List<Services> value) {
            toServices.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>services</b> for <b>Carriers</b> to multiple <b>Services</b>.
         * 
         */
        @Nonnull
        public Carriers.CarriersBuilder services(Services... value) {
            return toServices(Lists.newArrayList(value));
        }

        private Carriers.CarriersBuilder toActions(List<CarrierActions> value) {
            toActions.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>actions</b> for <b>Carriers</b> to multiple <b>CarrierActions</b>.
         * 
         */
        @Nonnull
        public Carriers.CarriersBuilder actions(CarrierActions... value) {
            return toActions(Lists.newArrayList(value));
        }

        private Carriers.CarriersBuilder toFeeds(List<CarrierFeeds> value) {
            toFeeds.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>feeds</b> for <b>Carriers</b> to multiple <b>CarrierFeeds</b>.
         * 
         */
        @Nonnull
        public Carriers.CarriersBuilder feeds(CarrierFeeds... value) {
            return toFeeds(Lists.newArrayList(value));
        }

    }

}
