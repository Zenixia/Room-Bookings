package com.glenoir.plugins.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the RoomBooking service. Represents a row in the &quot;RoomBooking_RoomBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.glenoir.plugins.model.impl.RoomBookingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.glenoir.plugins.model.impl.RoomBookingImpl}.
 * </p>
 *
 * @author guillaume Lenoir
 * @see RoomBooking
 * @see com.glenoir.plugins.model.impl.RoomBookingImpl
 * @see com.glenoir.plugins.model.impl.RoomBookingModelImpl
 * @generated
 */
public interface RoomBookingModel extends BaseModel<RoomBooking>,
    StagedGroupedModel, WorkflowedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a room booking model instance should use the {@link RoomBooking} interface instead.
     */

    /**
     * Returns the primary key of this room booking.
     *
     * @return the primary key of this room booking
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this room booking.
     *
     * @param primaryKey the primary key of this room booking
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this room booking.
     *
     * @return the uuid of this room booking
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this room booking.
     *
     * @param uuid the uuid of this room booking
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the room booking ID of this room booking.
     *
     * @return the room booking ID of this room booking
     */
    public long getRoomBookingId();

    /**
     * Sets the room booking ID of this room booking.
     *
     * @param roomBookingId the room booking ID of this room booking
     */
    public void setRoomBookingId(long roomBookingId);

    /**
     * Returns the company ID of this room booking.
     *
     * @return the company ID of this room booking
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this room booking.
     *
     * @param companyId the company ID of this room booking
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this room booking.
     *
     * @return the group ID of this room booking
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this room booking.
     *
     * @param groupId the group ID of this room booking
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the create date of this room booking.
     *
     * @return the create date of this room booking
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this room booking.
     *
     * @param createDate the create date of this room booking
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this room booking.
     *
     * @return the modified date of this room booking
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this room booking.
     *
     * @param modifiedDate the modified date of this room booking
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the user ID of this room booking.
     *
     * @return the user ID of this room booking
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this room booking.
     *
     * @param userId the user ID of this room booking
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this room booking.
     *
     * @return the user uuid of this room booking
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this room booking.
     *
     * @param userUuid the user uuid of this room booking
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this room booking.
     *
     * @return the user name of this room booking
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this room booking.
     *
     * @param userName the user name of this room booking
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the room ID of this room booking.
     *
     * @return the room ID of this room booking
     */
    public long getRoomId();

    /**
     * Sets the room ID of this room booking.
     *
     * @param roomId the room ID of this room booking
     */
    public void setRoomId(long roomId);

    /**
     * Returns the title of this room booking.
     *
     * @return the title of this room booking
     */
    public String getTitle();

    /**
     * Returns the localized title of this room booking in the language. Uses the default language if no localization exists for the requested language.
     *
     * @param locale the locale of the language
     * @return the localized title of this room booking
     */
    @AutoEscape
    public String getTitle(Locale locale);

    /**
     * Returns the localized title of this room booking in the language, optionally using the default language if no localization exists for the requested language.
     *
     * @param locale the local of the language
     * @param useDefault whether to use the default language if no localization exists for the requested language
     * @return the localized title of this room booking. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
     */
    @AutoEscape
    public String getTitle(Locale locale, boolean useDefault);

    /**
     * Returns the localized title of this room booking in the language. Uses the default language if no localization exists for the requested language.
     *
     * @param languageId the ID of the language
     * @return the localized title of this room booking
     */
    @AutoEscape
    public String getTitle(String languageId);

    /**
     * Returns the localized title of this room booking in the language, optionally using the default language if no localization exists for the requested language.
     *
     * @param languageId the ID of the language
     * @param useDefault whether to use the default language if no localization exists for the requested language
     * @return the localized title of this room booking
     */
    @AutoEscape
    public String getTitle(String languageId, boolean useDefault);

    @AutoEscape
    public String getTitleCurrentLanguageId();

    @AutoEscape
    public String getTitleCurrentValue();

    /**
     * Returns a map of the locales and localized titles of this room booking.
     *
     * @return the locales and localized titles of this room booking
     */
    public Map<Locale, String> getTitleMap();

    /**
     * Sets the title of this room booking.
     *
     * @param title the title of this room booking
     */
    public void setTitle(String title);

    /**
     * Sets the localized title of this room booking in the language.
     *
     * @param title the localized title of this room booking
     * @param locale the locale of the language
     */
    public void setTitle(String title, Locale locale);

    /**
     * Sets the localized title of this room booking in the language, and sets the default locale.
     *
     * @param title the localized title of this room booking
     * @param locale the locale of the language
     * @param defaultLocale the default locale
     */
    public void setTitle(String title, Locale locale, Locale defaultLocale);

    public void setTitleCurrentLanguageId(String languageId);

    /**
     * Sets the localized titles of this room booking from the map of locales and localized titles.
     *
     * @param titleMap the locales and localized titles of this room booking
     */
    public void setTitleMap(Map<Locale, String> titleMap);

    /**
     * Sets the localized titles of this room booking from the map of locales and localized titles, and sets the default locale.
     *
     * @param titleMap the locales and localized titles of this room booking
     * @param defaultLocale the default locale
     */
    public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

    /**
     * Returns the description of this room booking.
     *
     * @return the description of this room booking
     */
    public String getDescription();

    /**
     * Returns the localized description of this room booking in the language. Uses the default language if no localization exists for the requested language.
     *
     * @param locale the locale of the language
     * @return the localized description of this room booking
     */
    @AutoEscape
    public String getDescription(Locale locale);

    /**
     * Returns the localized description of this room booking in the language, optionally using the default language if no localization exists for the requested language.
     *
     * @param locale the local of the language
     * @param useDefault whether to use the default language if no localization exists for the requested language
     * @return the localized description of this room booking. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
     */
    @AutoEscape
    public String getDescription(Locale locale, boolean useDefault);

    /**
     * Returns the localized description of this room booking in the language. Uses the default language if no localization exists for the requested language.
     *
     * @param languageId the ID of the language
     * @return the localized description of this room booking
     */
    @AutoEscape
    public String getDescription(String languageId);

    /**
     * Returns the localized description of this room booking in the language, optionally using the default language if no localization exists for the requested language.
     *
     * @param languageId the ID of the language
     * @param useDefault whether to use the default language if no localization exists for the requested language
     * @return the localized description of this room booking
     */
    @AutoEscape
    public String getDescription(String languageId, boolean useDefault);

    @AutoEscape
    public String getDescriptionCurrentLanguageId();

    @AutoEscape
    public String getDescriptionCurrentValue();

    /**
     * Returns a map of the locales and localized descriptions of this room booking.
     *
     * @return the locales and localized descriptions of this room booking
     */
    public Map<Locale, String> getDescriptionMap();

    /**
     * Sets the description of this room booking.
     *
     * @param description the description of this room booking
     */
    public void setDescription(String description);

    /**
     * Sets the localized description of this room booking in the language.
     *
     * @param description the localized description of this room booking
     * @param locale the locale of the language
     */
    public void setDescription(String description, Locale locale);

    /**
     * Sets the localized description of this room booking in the language, and sets the default locale.
     *
     * @param description the localized description of this room booking
     * @param locale the locale of the language
     * @param defaultLocale the default locale
     */
    public void setDescription(String description, Locale locale,
        Locale defaultLocale);

    public void setDescriptionCurrentLanguageId(String languageId);

    /**
     * Sets the localized descriptions of this room booking from the map of locales and localized descriptions.
     *
     * @param descriptionMap the locales and localized descriptions of this room booking
     */
    public void setDescriptionMap(Map<Locale, String> descriptionMap);

    /**
     * Sets the localized descriptions of this room booking from the map of locales and localized descriptions, and sets the default locale.
     *
     * @param descriptionMap the locales and localized descriptions of this room booking
     * @param defaultLocale the default locale
     */
    public void setDescriptionMap(Map<Locale, String> descriptionMap,
        Locale defaultLocale);

    /**
     * Returns the start time of this room booking.
     *
     * @return the start time of this room booking
     */
    public long getStartTime();

    /**
     * Sets the start time of this room booking.
     *
     * @param startTime the start time of this room booking
     */
    public void setStartTime(long startTime);

    /**
     * Returns the end time of this room booking.
     *
     * @return the end time of this room booking
     */
    public long getEndTime();

    /**
     * Sets the end time of this room booking.
     *
     * @param endTime the end time of this room booking
     */
    public void setEndTime(long endTime);

    /**
     * Returns the all day of this room booking.
     *
     * @return the all day of this room booking
     */
    public boolean getAllDay();

    /**
     * Returns <code>true</code> if this room booking is all day.
     *
     * @return <code>true</code> if this room booking is all day; <code>false</code> otherwise
     */
    public boolean isAllDay();

    /**
     * Sets whether this room booking is all day.
     *
     * @param allDay the all day of this room booking
     */
    public void setAllDay(boolean allDay);

    /**
     * Returns the recurrence of this room booking.
     *
     * @return the recurrence of this room booking
     */
    @AutoEscape
    public String getRecurrence();

    /**
     * Sets the recurrence of this room booking.
     *
     * @param recurrence the recurrence of this room booking
     */
    public void setRecurrence(String recurrence);

    /**
     * Returns the first reminder of this room booking.
     *
     * @return the first reminder of this room booking
     */
    public long getFirstReminder();

    /**
     * Sets the first reminder of this room booking.
     *
     * @param firstReminder the first reminder of this room booking
     */
    public void setFirstReminder(long firstReminder);

    /**
     * Returns the first reminder type of this room booking.
     *
     * @return the first reminder type of this room booking
     */
    @AutoEscape
    public String getFirstReminderType();

    /**
     * Sets the first reminder type of this room booking.
     *
     * @param firstReminderType the first reminder type of this room booking
     */
    public void setFirstReminderType(String firstReminderType);

    /**
     * Returns the second reminder of this room booking.
     *
     * @return the second reminder of this room booking
     */
    public long getSecondReminder();

    /**
     * Sets the second reminder of this room booking.
     *
     * @param secondReminder the second reminder of this room booking
     */
    public void setSecondReminder(long secondReminder);

    /**
     * Returns the second reminder type of this room booking.
     *
     * @return the second reminder type of this room booking
     */
    @AutoEscape
    public String getSecondReminderType();

    /**
     * Sets the second reminder type of this room booking.
     *
     * @param secondReminderType the second reminder type of this room booking
     */
    public void setSecondReminderType(String secondReminderType);

    /**
     * Returns the status of this room booking.
     *
     * @return the status of this room booking
     */
    @Override
    public int getStatus();

    /**
     * Sets the status of this room booking.
     *
     * @param status the status of this room booking
     */
    @Override
    public void setStatus(int status);

    /**
     * Returns the status by user ID of this room booking.
     *
     * @return the status by user ID of this room booking
     */
    @Override
    public long getStatusByUserId();

    /**
     * Sets the status by user ID of this room booking.
     *
     * @param statusByUserId the status by user ID of this room booking
     */
    @Override
    public void setStatusByUserId(long statusByUserId);

    /**
     * Returns the status by user uuid of this room booking.
     *
     * @return the status by user uuid of this room booking
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getStatusByUserUuid() throws SystemException;

    /**
     * Sets the status by user uuid of this room booking.
     *
     * @param statusByUserUuid the status by user uuid of this room booking
     */
    @Override
    public void setStatusByUserUuid(String statusByUserUuid);

    /**
     * Returns the status by user name of this room booking.
     *
     * @return the status by user name of this room booking
     */
    @AutoEscape
    @Override
    public String getStatusByUserName();

    /**
     * Sets the status by user name of this room booking.
     *
     * @param statusByUserName the status by user name of this room booking
     */
    @Override
    public void setStatusByUserName(String statusByUserName);

    /**
     * Returns the status date of this room booking.
     *
     * @return the status date of this room booking
     */
    @Override
    public Date getStatusDate();

    /**
     * Sets the status date of this room booking.
     *
     * @param statusDate the status date of this room booking
     */
    @Override
    public void setStatusDate(Date statusDate);

    /**
     * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
     */
    @Override
    public boolean getApproved();

    /**
     * Returns <code>true</code> if this room booking is approved.
     *
     * @return <code>true</code> if this room booking is approved; <code>false</code> otherwise
     */
    @Override
    public boolean isApproved();

    /**
     * Returns <code>true</code> if this room booking is denied.
     *
     * @return <code>true</code> if this room booking is denied; <code>false</code> otherwise
     */
    @Override
    public boolean isDenied();

    /**
     * Returns <code>true</code> if this room booking is a draft.
     *
     * @return <code>true</code> if this room booking is a draft; <code>false</code> otherwise
     */
    @Override
    public boolean isDraft();

    /**
     * Returns <code>true</code> if this room booking is expired.
     *
     * @return <code>true</code> if this room booking is expired; <code>false</code> otherwise
     */
    @Override
    public boolean isExpired();

    /**
     * Returns <code>true</code> if this room booking is inactive.
     *
     * @return <code>true</code> if this room booking is inactive; <code>false</code> otherwise
     */
    @Override
    public boolean isInactive();

    /**
     * Returns <code>true</code> if this room booking is incomplete.
     *
     * @return <code>true</code> if this room booking is incomplete; <code>false</code> otherwise
     */
    @Override
    public boolean isIncomplete();

    /**
     * Returns <code>true</code> if this room booking is pending.
     *
     * @return <code>true</code> if this room booking is pending; <code>false</code> otherwise
     */
    @Override
    public boolean isPending();

    /**
     * Returns <code>true</code> if this room booking is scheduled.
     *
     * @return <code>true</code> if this room booking is scheduled; <code>false</code> otherwise
     */
    @Override
    public boolean isScheduled();

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public String[] getAvailableLanguageIds();

    public String getDefaultLanguageId();

    public void prepareLocalizedFieldsForImport() throws LocaleException;

    public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
        throws LocaleException;

    @Override
    public Object clone();

    @Override
    public int compareTo(RoomBooking roomBooking);

    @Override
    public int hashCode();

    @Override
    public CacheModel<RoomBooking> toCacheModel();

    @Override
    public RoomBooking toEscapedModel();

    @Override
    public RoomBooking toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
