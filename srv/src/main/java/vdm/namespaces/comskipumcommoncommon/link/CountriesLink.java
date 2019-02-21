/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.comskipumcommoncommon.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import vdm.namespaces.comskipumcommoncommon.Countries;
import vdm.namespaces.comskipumcommoncommon.selectable.CountriesSelectable;


/**
 * Template class to represent entity navigation links of {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CountriesLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CountriesLink<ObjectT> , Countries, ObjectT>
    implements CountriesSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CountriesLink(final String fieldName) {
        super(fieldName);
    }

    private CountriesLink(final EntityLink<CountriesLink<ObjectT> , Countries, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected CountriesLink<ObjectT> translateLinkType(final EntityLink<CountriesLink<ObjectT> , Countries, ObjectT> link) {
        return new CountriesLink<ObjectT>(link);
    }

}
