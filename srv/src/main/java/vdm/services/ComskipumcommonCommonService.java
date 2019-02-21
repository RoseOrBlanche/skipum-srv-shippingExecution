/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import vdm.namespaces.comskipumcommoncommon.Countries;
import vdm.namespaces.comskipumcommoncommon.CountriesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CountriesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CountriesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CountriesFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CountriesUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.Currencies;
import vdm.namespaces.comskipumcommoncommon.CurrenciesByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CurrenciesCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CurrenciesDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CurrenciesFluentHelper;
import vdm.namespaces.comskipumcommoncommon.CurrenciesUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.DistanceUnits;
import vdm.namespaces.comskipumcommoncommon.DistanceUnitsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.DistanceUnitsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.DistanceUnitsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.DistanceUnitsFluentHelper;
import vdm.namespaces.comskipumcommoncommon.DistanceUnitsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.Regions;
import vdm.namespaces.comskipumcommoncommon.RegionsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.RegionsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.RegionsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.RegionsFluentHelper;
import vdm.namespaces.comskipumcommoncommon.RegionsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.VolumeUnits;
import vdm.namespaces.comskipumcommoncommon.VolumeUnitsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.VolumeUnitsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.VolumeUnitsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.VolumeUnitsFluentHelper;
import vdm.namespaces.comskipumcommoncommon.VolumeUnitsUpdateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.WeightUnits;
import vdm.namespaces.comskipumcommoncommon.WeightUnitsByKeyFluentHelper;
import vdm.namespaces.comskipumcommoncommon.WeightUnitsCreateFluentHelper;
import vdm.namespaces.comskipumcommoncommon.WeightUnitsDeleteFluentHelper;
import vdm.namespaces.comskipumcommoncommon.WeightUnitsFluentHelper;
import vdm.namespaces.comskipumcommoncommon.WeightUnitsUpdateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>comskipumcommonCommonService</td></tr></table>
 * 
 */
public interface ComskipumcommonCommonService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "comskipumcommonCommonService";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    ComskipumcommonCommonService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CountriesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CountriesFluentHelper getAllCountries();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CountriesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CountriesByKeyFluentHelper getCountriesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity and save it to the S/4HANA system.
     * 
     * @param countries
     *     {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CountriesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CountriesCreateFluentHelper createCountries(
        @Nonnull
        final Countries countries);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity and save it to the S/4HANA system.
     * 
     * @param countries
     *     {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CountriesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CountriesUpdateFluentHelper updateCountries(
        @Nonnull
        final Countries countries);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity in the S/4HANA system.
     * 
     * @param countries
     *     {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.Countries Countries} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CountriesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CountriesDeleteFluentHelper deleteCountries(
        @Nonnull
        final Countries countries);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CurrenciesFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CurrenciesFluentHelper getAllCurrencies();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CurrenciesByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CurrenciesByKeyFluentHelper getCurrenciesByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity and save it to the S/4HANA system.
     * 
     * @param currencies
     *     {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CurrenciesCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CurrenciesCreateFluentHelper createCurrencies(
        @Nonnull
        final Currencies currencies);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity and save it to the S/4HANA system.
     * 
     * @param currencies
     *     {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CurrenciesUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CurrenciesUpdateFluentHelper updateCurrencies(
        @Nonnull
        final Currencies currencies);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity in the S/4HANA system.
     * 
     * @param currencies
     *     {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.Currencies Currencies} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.CurrenciesDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CurrenciesDeleteFluentHelper deleteCurrencies(
        @Nonnull
        final Currencies currencies);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.DistanceUnitsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    DistanceUnitsFluentHelper getAllDistanceUnits();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.DistanceUnitsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    DistanceUnitsByKeyFluentHelper getDistanceUnitsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity and save it to the S/4HANA system.
     * 
     * @param distanceUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.DistanceUnitsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    DistanceUnitsCreateFluentHelper createDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity and save it to the S/4HANA system.
     * 
     * @param distanceUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.DistanceUnitsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    DistanceUnitsUpdateFluentHelper updateDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity in the S/4HANA system.
     * 
     * @param distanceUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.DistanceUnits DistanceUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.DistanceUnitsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    DistanceUnitsDeleteFluentHelper deleteDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.RegionsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    RegionsFluentHelper getAllRegions();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity using key fields.
     * 
     * @param country_code
     *     
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.RegionsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    RegionsByKeyFluentHelper getRegionsByKey(final String code, final String country_code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity and save it to the S/4HANA system.
     * 
     * @param regions
     *     {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.RegionsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    RegionsCreateFluentHelper createRegions(
        @Nonnull
        final Regions regions);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity and save it to the S/4HANA system.
     * 
     * @param regions
     *     {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.RegionsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    RegionsUpdateFluentHelper updateRegions(
        @Nonnull
        final Regions regions);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity in the S/4HANA system.
     * 
     * @param regions
     *     {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.Regions Regions} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.RegionsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    RegionsDeleteFluentHelper deleteRegions(
        @Nonnull
        final Regions regions);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.VolumeUnitsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    VolumeUnitsFluentHelper getAllVolumeUnits();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.VolumeUnitsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    VolumeUnitsByKeyFluentHelper getVolumeUnitsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity and save it to the S/4HANA system.
     * 
     * @param volumeUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.VolumeUnitsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    VolumeUnitsCreateFluentHelper createVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity and save it to the S/4HANA system.
     * 
     * @param volumeUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.VolumeUnitsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    VolumeUnitsUpdateFluentHelper updateVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity in the S/4HANA system.
     * 
     * @param volumeUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.VolumeUnits VolumeUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.VolumeUnitsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    VolumeUnitsDeleteFluentHelper deleteVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits);

    /**
     * Fetch multiple {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.WeightUnitsFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    WeightUnitsFluentHelper getAllWeightUnits();

    /**
     * Fetch a single {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity using key fields.
     * 
     * @param code
     *     
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.WeightUnitsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    WeightUnitsByKeyFluentHelper getWeightUnitsByKey(final String code);

    /**
     * Create a new {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity and save it to the S/4HANA system.
     * 
     * @param weightUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.WeightUnitsCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    WeightUnitsCreateFluentHelper createWeightUnits(
        @Nonnull
        final WeightUnits weightUnits);

    /**
     * Update an existing {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity and save it to the S/4HANA system.
     * 
     * @param weightUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.WeightUnitsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    WeightUnitsUpdateFluentHelper updateWeightUnits(
        @Nonnull
        final WeightUnits weightUnits);

    /**
     * Deletes an existing {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity in the S/4HANA system.
     * 
     * @param weightUnits
     *     {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.comskipumcommoncommon.WeightUnits WeightUnits} entity. To perform execution, call the {@link vdm.namespaces.comskipumcommoncommon.WeightUnitsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    WeightUnitsDeleteFluentHelper deleteWeightUnits(
        @Nonnull
        final WeightUnits weightUnits);

}
