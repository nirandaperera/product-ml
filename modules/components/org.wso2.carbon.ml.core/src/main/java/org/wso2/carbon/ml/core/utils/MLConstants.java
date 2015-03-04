package org.wso2.carbon.ml.core.utils;

public class MLConstants {

    public static final String ML_CONFIG_XML = "repository/conf/etc/ml-config.xml";
    
    // Data-set upload configurations    
    public static final String UPLOAD_SETTINGS = "dataUploadSettings";
    public static final String UPLOAD_LOCATION = "uploadLocation";
    public static final String IN_MEMORY_THRESHOLD = "inMemoryThreshold";
    public static final String UPLOAD_LIMIT = "uploadLimit";
    
    // Summary statistic calculation configurations  
    public static final String SUMMARY_STATISTICS_SETTINGS = "summaryStatisticsSettings";
    public static final String HISTOGRAM_BINS = "histogramBins";
    public static final String CATEGORICAL_THRESHOLD = "categoricalThreshold";
    public static final String SAMPLE_SIZE = "sampleSize";
    
    public static final String PROPERTIES = "properties";
    public static final String PROPERTY = "property";
    
    // System property names
    public static final String HOME = "user.home";
    public static final String FILE_SEPARATOR = "file.separator";
    
    public static final String USER_HOME= "USER_HOME";
    public static final String DATABASE= "database";
    public static final String ML_PROJECTS = "MLProjects";
    
    // Character Encodings
    public static final String UTF_8= "UTF-8";
    public static final String ISO_8859_1= "ISO-8859-1";
    
    public static final String TARGET_HOME_PROP = "target.home";
    public static final String ML_THREAD_POOL_SIZE = "ml.thread.pool.size";
}