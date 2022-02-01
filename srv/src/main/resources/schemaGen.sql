
DROP TABLE IF EXISTS POAccrualDataController_POAccrualData;

CREATE TABLE POAccrualDataController_POAccrualData (
  OPSYS NVARCHAR(3) NOT NULL,
  EBELN INTEGER,
  controller NVARCHAR(25),
  PRIMARY KEY(OPSYS)
);

