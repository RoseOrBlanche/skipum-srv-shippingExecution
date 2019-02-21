/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vdm.namespaces.comskipumcommoncommon.field.WeightUnitsField;
import vdm.namespaces.comskipumcommoncommon.selectable.WeightUnitsSelectable;


/**
 * <p>Original entity name from the Odata EDM: <b>WeightUnits</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class WeightUnits
    extends VdmEntity<WeightUnits>
{

    /**
     * Selector for all available fields of WeightUnits.
     * 
     */
    public final static WeightUnitsSelectable ALL_FIELDS = new WeightUnitsSelectable() {


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
    public final static WeightUnitsField<String> NAME = new WeightUnitsField<String>("name");
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
    public final static WeightUnitsField<String> CODE = new WeightUnitsField<String>("code");
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
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<WeightUnits> getType() {
        return WeightUnits.class;
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

    @Override
    protected String getEntityCollection() {
        return "WeightUnits";
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
        }
        // structured properties
        {
        }
        // navigation properties
        {
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
    public static<T >WeightUnitsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new WeightUnitsField<T>(fieldName);
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
    public static<T,DomainT >WeightUnitsField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new WeightUnitsField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
