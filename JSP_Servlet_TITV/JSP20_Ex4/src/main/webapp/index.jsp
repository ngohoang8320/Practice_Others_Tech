<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="billPage.jsp" method="GET">
        <h1>Choose options for your computer</h1>
        <hr>
        <h3>Processor</h3>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="processor" id="corei9" value="corei9"
                   checked>
            <label class="form-check-label" for="corei9">
                Core i9
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="processor" id="corei7" value="corei7"
                   checked>
            <label class="form-check-label" for="corei7">
                Core i7
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="processor" id="corei5" value="corei5"
                   checked>
            <label class="form-check-label" for="corei5">
                Core i5
            </label>
        </div>

        <h3>RAM</h3>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="ram8gb" value="ram8gb" name="ram">
            <label class="form-check-label" for="ram8gb">Ram 8Gb</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="ram16gb" value="ram16gb" name="ram">
            <label class="form-check-label" for="ram16gb">Ram 16Gb</label>
        </div>

        <h3>Monitor</h3>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="monitor" value="monitor" name="monitor">
            <label class="form-check-label" for="monitor">Monitor</label>
        </div>

        <h3>Accessories</h3>
        <select class="form-select" name="accessories" multiple>
            <option value="Camera">Camera</option>
            <option value="Printer">Printer</option>
            <option value="Scanner">Scanner</option>
        </select>
        <button type="submit" class="btn btn-primary mt-2">Buy</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>