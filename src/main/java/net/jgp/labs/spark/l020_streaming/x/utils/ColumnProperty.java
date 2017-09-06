package net.jgp.labs.spark.l020_streaming.x.utils;

public class ColumnProperty {

	private RecordType recordType;
	private String option;

	public ColumnProperty(RecordType recordType, String option) {
		this.recordType = recordType;
		this.option = option;
	}

	public RecordType getRecordType() {
		return recordType;
	}

	public void setRecordType(RecordType recordType) {
		this.recordType = recordType;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
