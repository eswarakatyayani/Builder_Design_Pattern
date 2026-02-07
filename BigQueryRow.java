//Traditional Approach
class BigQueryRow {
    private String orderNumber;
    private String orderVersion;
    private String created;
    private String notesType;
    private String notes;

    private BigQueryRow(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.orderVersion = builder.orderVersion;
        this.created = builder.created;
        this.notesType = builder.notesType;
        this.notes = builder.notes;
    }

    public static class Builder {
        private String orderNumber;
        private String orderVersion;
        private String created;
        private String notesType;
        private String notes;

        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder orderVersion(String orderVersion) {
            this.orderVersion = orderVersion;
            return this;
        }

        public Builder created(String created) {
            this.created = created;
            return this;
        }

        public Builder notesType(String notesType) {
            this.notesType = notesType;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public BigQueryRow build() {
            return new BigQueryRow(this);
        }
    }

    @Override
    public String toString() {
        return orderNumber + " | " + orderVersion + " | " + created + " | " + notesType + " | " + notes;
    }
}

public class Main {
    public static void main(String[] args) {
        BigQueryRow row = new BigQueryRow.Builder()
                .orderNumber("NC6303228278")
                .orderVersion("V1")
                .created("2026-02-07")
                .notesType("remarks")
                .notes("Order Created")
                .build();
        System.out.println(row);
    }
}

/*
Output:
NC6303228278 | V1 | 2026-02-07 | remarks | Order Created
*/
