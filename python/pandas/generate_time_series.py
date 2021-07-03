def generate_time_series(start: str, end: str, frequency: str) -> pandas.DataFrame:
    """
    Generates a DatetimeIndex Time Series data object and returns
    as an indexed DataFrame object.
    
    Args:
        start: str starting date in pandas-compliant datetime format
        end: str starting date in pandas-compliant datetime format
        frequency: str value for date frequency in pandas IntervalIndex

    Notes:
        Requires the Pandas library to be imported as such:
            import pandas as pd
        Uses the date_range function from Pandas to generate TimeSeriesIndex
        
    Returns:
        'date' indexed Time Series Pandas.DataFrame
    """
    # Generate series from start of 2016 to end of 2020
    time_series = pd.date_range(start=start, end=end, freq=frequency)

    # Convert to DataFrame object
    time_series = pd.DataFrame(time_series, columns=['date'])

    # Set index and return DataFrame
    time_series.set_index('date', inplace=True)
    return time_series
