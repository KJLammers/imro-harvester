alter table bestemmingsplan drop column geometrie;
alter table bouwaanduiding drop column geometrie;
alter table bouwvlak drop column geometrie;
alter table dubbelbestemming drop column geometrie;
alter table enkelbestemming drop column geometrie;
alter table figuur drop column geometrie;
alter table functieaanduiding drop column geometrie;
alter table gebiedsaanduiding drop column geometrie;
alter table maatvoering drop column geometrie;
alter table besluitgebied drop column geometrie;
alter table besluitvlak drop column geometrie;
alter table besluitsubvlak drop column geometrie;

select addgeometrycolumn ('public','bestemmingsplan', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','bouwaanduiding', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','bouwvlak', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','dubbelbestemming', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','enkelbestemming', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','figuur', 'geometrie',28992, 'MULTILINESTRING',2);
select addgeometrycolumn ('public','functieaanduiding', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','gebiedsaanduiding', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','maatvoering', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','besluitgebied', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','besluitvlak', 'geometrie',28992, 'MULTIPOLYGON',2);
select addgeometrycolumn ('public','besluitsubvlak', 'geometrie',28992, 'MULTIPOLYGON',2);