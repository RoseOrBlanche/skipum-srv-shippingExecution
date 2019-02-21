/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("vdm.services.DefaultComskipumcommonCommonService")
public class DefaultComskipumcommonCommonService
    implements ComskipumcommonCommonService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link ComskipumcommonCommonService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultComskipumcommonCommonService() {
        servicePath = ComskipumcommonCommonService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultComskipumcommonCommonService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultComskipumcommonCommonService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultComskipumcommonCommonService(servicePath);
    }

    @Override
    @Nonnull
    public CountriesFluentHelper getAllCountries() {
        return new CountriesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CountriesByKeyFluentHelper getCountriesByKey(final String code) {
        return new CountriesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public CountriesCreateFluentHelper createCountries(
        @Nonnull
        final Countries countries) {
        return new CountriesCreateFluentHelper(servicePath, countries);
    }

    @Override
    @Nonnull
    public CountriesUpdateFluentHelper updateCountries(
        @Nonnull
        final Countries countries) {
        return new CountriesUpdateFluentHelper(servicePath, countries);
    }

    @Override
    @Nonnull
    public CountriesDeleteFluentHelper deleteCountries(
        @Nonnull
        final Countries countries) {
        return new CountriesDeleteFluentHelper(servicePath, countries);
    }

    @Override
    @Nonnull
    public CurrenciesFluentHelper getAllCurrencies() {
        return new CurrenciesFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CurrenciesByKeyFluentHelper getCurrenciesByKey(final String code) {
        return new CurrenciesByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public CurrenciesCreateFluentHelper createCurrencies(
        @Nonnull
        final Currencies currencies) {
        return new CurrenciesCreateFluentHelper(servicePath, currencies);
    }

    @Override
    @Nonnull
    public CurrenciesUpdateFluentHelper updateCurrencies(
        @Nonnull
        final Currencies currencies) {
        return new CurrenciesUpdateFluentHelper(servicePath, currencies);
    }

    @Override
    @Nonnull
    public CurrenciesDeleteFluentHelper deleteCurrencies(
        @Nonnull
        final Currencies currencies) {
        return new CurrenciesDeleteFluentHelper(servicePath, currencies);
    }

    @Override
    @Nonnull
    public DistanceUnitsFluentHelper getAllDistanceUnits() {
        return new DistanceUnitsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public DistanceUnitsByKeyFluentHelper getDistanceUnitsByKey(final String code) {
        return new DistanceUnitsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public DistanceUnitsCreateFluentHelper createDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits) {
        return new DistanceUnitsCreateFluentHelper(servicePath, distanceUnits);
    }

    @Override
    @Nonnull
    public DistanceUnitsUpdateFluentHelper updateDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits) {
        return new DistanceUnitsUpdateFluentHelper(servicePath, distanceUnits);
    }

    @Override
    @Nonnull
    public DistanceUnitsDeleteFluentHelper deleteDistanceUnits(
        @Nonnull
        final DistanceUnits distanceUnits) {
        return new DistanceUnitsDeleteFluentHelper(servicePath, distanceUnits);
    }

    @Override
    @Nonnull
    public RegionsFluentHelper getAllRegions() {
        return new RegionsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public RegionsByKeyFluentHelper getRegionsByKey(final String code, final String country_code) {
        return new RegionsByKeyFluentHelper(servicePath, code, country_code);
    }

    @Override
    @Nonnull
    public RegionsCreateFluentHelper createRegions(
        @Nonnull
        final Regions regions) {
        return new RegionsCreateFluentHelper(servicePath, regions);
    }

    @Override
    @Nonnull
    public RegionsUpdateFluentHelper updateRegions(
        @Nonnull
        final Regions regions) {
        return new RegionsUpdateFluentHelper(servicePath, regions);
    }

    @Override
    @Nonnull
    public RegionsDeleteFluentHelper deleteRegions(
        @Nonnull
        final Regions regions) {
        return new RegionsDeleteFluentHelper(servicePath, regions);
    }

    @Override
    @Nonnull
    public VolumeUnitsFluentHelper getAllVolumeUnits() {
        return new VolumeUnitsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public VolumeUnitsByKeyFluentHelper getVolumeUnitsByKey(final String code) {
        return new VolumeUnitsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public VolumeUnitsCreateFluentHelper createVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits) {
        return new VolumeUnitsCreateFluentHelper(servicePath, volumeUnits);
    }

    @Override
    @Nonnull
    public VolumeUnitsUpdateFluentHelper updateVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits) {
        return new VolumeUnitsUpdateFluentHelper(servicePath, volumeUnits);
    }

    @Override
    @Nonnull
    public VolumeUnitsDeleteFluentHelper deleteVolumeUnits(
        @Nonnull
        final VolumeUnits volumeUnits) {
        return new VolumeUnitsDeleteFluentHelper(servicePath, volumeUnits);
    }

    @Override
    @Nonnull
    public WeightUnitsFluentHelper getAllWeightUnits() {
        return new WeightUnitsFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public WeightUnitsByKeyFluentHelper getWeightUnitsByKey(final String code) {
        return new WeightUnitsByKeyFluentHelper(servicePath, code);
    }

    @Override
    @Nonnull
    public WeightUnitsCreateFluentHelper createWeightUnits(
        @Nonnull
        final WeightUnits weightUnits) {
        return new WeightUnitsCreateFluentHelper(servicePath, weightUnits);
    }

    @Override
    @Nonnull
    public WeightUnitsUpdateFluentHelper updateWeightUnits(
        @Nonnull
        final WeightUnits weightUnits) {
        return new WeightUnitsUpdateFluentHelper(servicePath, weightUnits);
    }

    @Override
    @Nonnull
    public WeightUnitsDeleteFluentHelper deleteWeightUnits(
        @Nonnull
        final WeightUnits weightUnits) {
        return new WeightUnitsDeleteFluentHelper(servicePath, weightUnits);
    }

}
