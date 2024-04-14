
# Crypto Tracker App

A brief description of what this project does and who it's for



The provided code is for an Android application that retrieves cryptocurrency data from the CoinMarketCap API and displays it in a RecyclerView. The app allows users to search for specific cryptocurrencies by name. It fetches the latest cryptocurrency data using Volley, a networking library for Android. The fetched data includes the name, symbol, and price of each cryptocurrency in USD. The app dynamically updates the RecyclerView as the user types in the search bar, filtering the displayed data based on the user's input. If there are no matching results for the search query, a toast message informs the user. The application is suitable for anyone interested in tracking cryptocurrency prices on their Android device.
## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **33e0855c-aac4-400d-8130-898c844235d5**. |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |




## Appendix

## Appendix

This application utilizes CoinMarketCap API to fetch the latest cryptocurrency data. The main functionality of the app includes displaying a list of cryptocurrencies along with their symbols and prices in USD. Users can search for specific cryptocurrencies by name, and the app dynamically updates the list based on the search query.

The provided Kotlin code interacts with the CoinMarketCap API to retrieve the cryptocurrency data using Volley, a networking library for Android. It then populates a RecyclerView with the fetched data and allows users to search for cryptocurrencies.

For more detailed reference and implementation, please refer to the provided .kts code snippet. If you have any questions or need further assistance, feel free to ask!


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |


## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY` from CoinMarket API




## FAQ

#### How often does the cryptocurrency data update?

The cryptocurrency data is updated periodically based on the latest information available from the CoinMarketCap API. By default, the app fetches the latest data when it is launched or when the user refreshes the data manually.

#### Can I search for cryptocurrencies by their symbols?

Yes, you can search for cryptocurrencies not only by their names but also by their symbols. The search functionality in the app filters the list of cryptocurrencies based on both their names and symbols, providing a convenient way to find specific cryptocurrencies.



## Installation

Install my-project with npm

```bash
  npm install my-project
  cd my-project
```
    
![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)

